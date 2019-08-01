package org.itxtech.synapseapi.network.protocol.spp;


import cn.nukkit.utils.BinaryStream;

public abstract class SynapseDataPacket extends BinaryStream implements Cloneable {

    public boolean isEncoded;

    public abstract byte pid();

    public abstract void decode();

    public abstract void encode();

    @Override
    public BinaryStream reset() {
        return super.reset();
    }

    public SynapseDataPacket clean() {
        this.setBuffer(null);

        this.isEncoded = false;
        this.offset = 0;
        return this;
    }

    @Override
    public SynapseDataPacket clone() {
        try {
            return (SynapseDataPacket) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
