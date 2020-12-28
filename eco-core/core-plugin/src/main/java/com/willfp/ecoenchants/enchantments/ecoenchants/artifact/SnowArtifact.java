package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import org.bukkit.Particle;
import org.jetbrains.annotations.NotNull;

public class SnowArtifact extends Artifact {
    public SnowArtifact() {
        super(
                "snow_artifact"
        );
    }

    @Override
    public @NotNull Particle getParticle() {
        return Particle.SNOWBALL;
    }
}
