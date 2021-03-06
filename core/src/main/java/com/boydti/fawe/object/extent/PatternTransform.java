package com.boydti.fawe.object.extent;

import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.WorldEditException;
import com.sk89q.worldedit.blocks.BaseBlock;
import com.sk89q.worldedit.extent.Extent;
import com.sk89q.worldedit.function.pattern.Pattern;

public class PatternTransform extends ResettableExtent {
    private final Pattern pattern;

    public PatternTransform(Extent parent, Pattern pattern) {
        super(parent);
        this.pattern = pattern;
    }

    @Override
    public boolean setBlock(Vector location, BaseBlock block) throws WorldEditException {
        return pattern.apply(getExtent(), location, location);
    }
}