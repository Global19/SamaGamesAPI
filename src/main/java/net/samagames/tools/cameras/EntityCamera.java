package net.samagames.tools.cameras;

import net.minecraft.server.v1_10_R1.EntityGuardian;
import net.minecraft.server.v1_10_R1.NBTTagCompound;
import net.minecraft.server.v1_10_R1.SoundEffect;
import net.minecraft.server.v1_10_R1.World;

public class EntityCamera extends EntityGuardian
{
    EntityCamera(World world)
    {
        super(world);

        this.setInvisible(true);
        this.setInvulnerable(true);
        this.setNoGravity(true);
    }

    @Override
    protected void r() {}

    @Override
    public void b(NBTTagCompound nbttagcompound) {}

    @Override
    public boolean c(NBTTagCompound nbttagcompound)
    {
        return false;
    }

    @Override
    public void a(NBTTagCompound nbttagcompound) {}

    @Override
    public boolean d(NBTTagCompound nbttagcompound)
    {
        return false;
    }

    @Override
    public void f(NBTTagCompound nbttagcompound) {}

    @Override
    protected SoundEffect G()
    {
        return null;
    }
}
