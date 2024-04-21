package mods.officialy.chromatica.client;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

public class ChromaLeafParticle extends TextureSheetParticle {

    private static final float ACCELERATION_SCALE = 0.0025F;
    private static final int INITIAL_LIFETIME = 300;
    private static final int CURVE_ENDPOINT_TIME = 300;
    private static final float FALL_ACC = 0.25F;
    private static final float WIND_BIG = 2.0F;
    private float rotSpeed;
    private final float particleRandom;
    private final float spinAcceleration;

    protected ChromaLeafParticle(ClientLevel p_277612_, double p_278010_, double p_277614_, double p_277673_, int colour, SpriteSet p_277465_) {
        super(p_277612_, p_278010_, p_277614_, p_277673_);
        this.setSprite(p_277465_.get(this.random.nextInt(12), 12));
        this.rotSpeed = (float) Math.toRadians(this.random.nextBoolean() ? -30.0 : 30.0);
        this.particleRandom = this.random.nextFloat();
        this.spinAcceleration = (float) Math.toRadians(this.random.nextBoolean() ? -5.0 : 5.0);
        this.lifetime = 300;
        this.gravity = 7.5E-4F;
        float f = this.random.nextBoolean() ? 0.05F : 0.075F;
        this.quadSize = f;
        this.setSize(f, f);
        this.friction = 1.0F;

        this.rCol = (colour >> 16 & 0xFF) / 255f;
        this.gCol = (colour >> 8 & 0xFF) / 255f;
        this.bCol = (colour & 0xFF) / 255f;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.lifetime-- <= 0) {
            this.remove();
        }

        if (!this.removed) {
            float f = (float) (300 - this.lifetime);
            float f1 = Math.min(f / 300.0F, 1.0F);
            double d0 = Math.cos(Math.toRadians((double) (this.particleRandom * 60.0F))) * 2.0 * Math.pow((double) f1, 1.25);
            double d1 = Math.sin(Math.toRadians((double) (this.particleRandom * 60.0F))) * 2.0 * Math.pow((double) f1, 1.25);
            this.xd += d0 * 0.0025F;
            this.zd += d1 * 0.0025F;
            this.yd -= (double) this.gravity;
            this.rotSpeed += this.spinAcceleration / 20.0F;
            this.oRoll = this.roll;
            this.roll += this.rotSpeed / 20.0F;
            this.move(this.xd, this.yd, this.zd);
            if (this.onGround || this.lifetime < 299 && (this.xd == 0.0 || this.zd == 0.0)) {
                this.remove();
            }

            if (!this.removed) {
                this.xd *= (double) this.friction;
                this.yd *= (double) this.friction;
                this.zd *= (double) this.friction;
            }
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public Provider(SpriteSet p_105566_) {
            this.sprites = p_105566_;
        }

        public Particle createParticle(
                SimpleParticleType p_105577_,
                ClientLevel p_105578_,
                double p_105579_,
                double p_105580_,
                double p_105581_,
                double p_105582_,
                double p_105583_,
                double p_105584_
        ) {
            return new ChromaLeafParticle(p_105578_, p_105579_, p_105580_, p_105581_, 0xFFFFFF, this.sprites);
        }
    }
}
