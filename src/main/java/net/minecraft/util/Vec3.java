package net.minecraft.util;

import net.minecraft.util.math.MathHelper;

public class Vec3 {
    
    public double x_Coord;
    
    public double y_Coord;
    
    public double z_Coord;
    private static final String __OBFID = "CL_00000612";

    
    public static Vec3 createVectorHelper(double p_72443_0_, double p_72443_2_, double p_72443_4_)
    {
        return new Vec3(p_72443_0_, p_72443_2_, p_72443_4_);
    }

    protected Vec3(double p_i1108_1_, double p_i1108_3_, double p_i1108_5_)
    {
        if (p_i1108_1_ == -0.0D)
        {
            p_i1108_1_ = 0.0D;
        }

        if (p_i1108_3_ == -0.0D)
        {
            p_i1108_3_ = 0.0D;
        }

        if (p_i1108_5_ == -0.0D)
        {
            p_i1108_5_ = 0.0D;
        }

        this.x_Coord = p_i1108_1_;
        this.y_Coord = p_i1108_3_;
        this.z_Coord = p_i1108_5_;
    }

    
    protected Vec3 setComponents(double p_72439_1_, double p_72439_3_, double p_72439_5_)
    {
        this.x_Coord = p_72439_1_;
        this.y_Coord = p_72439_3_;
        this.z_Coord = p_72439_5_;
        return this;
    }

    
    public Vec3 subtract(Vec3 p_72444_1_)
    {
        
        return createVectorHelper(p_72444_1_.x_Coord - this.x_Coord, p_72444_1_.y_Coord - this.y_Coord, p_72444_1_.z_Coord - this.z_Coord);
    }

    
    public Vec3 normalize()
    {
        double d0 = (double)MathHelper.sqrt_double(this.x_Coord * this.x_Coord + this.y_Coord * this.y_Coord + this.z_Coord * this.z_Coord);
        return d0 < 1.0E-4D ? createVectorHelper(0.0D, 0.0D, 0.0D) : createVectorHelper(this.x_Coord / d0, this.y_Coord / d0, this.z_Coord / d0);
    }

    public double dotProduct(Vec3 p_72430_1_)
    {
        return this.x_Coord * p_72430_1_.x_Coord + this.y_Coord * p_72430_1_.y_Coord + this.z_Coord * p_72430_1_.z_Coord;
    }

    
    public Vec3 crossProduct(Vec3 p_72431_1_)
    {
        
        return createVectorHelper(this.y_Coord * p_72431_1_.z_Coord - this.z_Coord * p_72431_1_.y_Coord, this.z_Coord * p_72431_1_.x_Coord - this.x_Coord * p_72431_1_.z_Coord, this.x_Coord * p_72431_1_.y_Coord - this.y_Coord * p_72431_1_.x_Coord);
    }

    
    public Vec3 addVector(double p_72441_1_, double p_72441_3_, double p_72441_5_)
    {
        
        return createVectorHelper(this.x_Coord + p_72441_1_, this.y_Coord + p_72441_3_, this.z_Coord + p_72441_5_);
    }

    
    public double distanceTo(Vec3 p_72438_1_)
    {
        double d0 = p_72438_1_.x_Coord - this.x_Coord;
        double d1 = p_72438_1_.y_Coord - this.y_Coord;
        double d2 = p_72438_1_.z_Coord - this.z_Coord;
        return (double)MathHelper.sqrt_double(d0 * d0 + d1 * d1 + d2 * d2);
    }

    
    public double squareDistanceTo(Vec3 p_72436_1_)
    {
        double d0 = p_72436_1_.x_Coord - this.x_Coord;
        double d1 = p_72436_1_.y_Coord - this.y_Coord;
        double d2 = p_72436_1_.z_Coord - this.z_Coord;
        return d0 * d0 + d1 * d1 + d2 * d2;
    }

    
    public double squareDistanceTo(double p_72445_1_, double p_72445_3_, double p_72445_5_)
    {
        double d3 = p_72445_1_ - this.x_Coord;
        double d4 = p_72445_3_ - this.y_Coord;
        double d5 = p_72445_5_ - this.z_Coord;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    
    public double lengthVector()
    {
        return (double)MathHelper.sqrt_double(this.x_Coord * this.x_Coord + this.y_Coord * this.y_Coord + this.z_Coord * this.z_Coord);
    }

    
    public Vec3 getIntermediateWithXValue(Vec3 p_72429_1_, double p_72429_2_)
    {
        double d1 = p_72429_1_.x_Coord - this.x_Coord;
        double d2 = p_72429_1_.y_Coord - this.y_Coord;
        double d3 = p_72429_1_.z_Coord - this.z_Coord;

        if (d1 * d1 < 1.0000000116860974E-7D)
        {
            return null;
        }
        else
        {
            double d4 = (p_72429_2_ - this.x_Coord) / d1;
            return d4 >= 0.0D && d4 <= 1.0D ? createVectorHelper(this.x_Coord + d1 * d4, this.y_Coord + d2 * d4, this.z_Coord + d3 * d4) : null;
        }
    }

    
    public Vec3 getIntermediateWithYValue(Vec3 p_72435_1_, double p_72435_2_)
    {
        double d1 = p_72435_1_.x_Coord - this.x_Coord;
        double d2 = p_72435_1_.y_Coord - this.y_Coord;
        double d3 = p_72435_1_.z_Coord - this.z_Coord;

        if (d2 * d2 < 1.0000000116860974E-7D)
        {
            return null;
        }
        else
        {
            double d4 = (p_72435_2_ - this.y_Coord) / d2;
            return d4 >= 0.0D && d4 <= 1.0D ? createVectorHelper(this.x_Coord + d1 * d4, this.y_Coord + d2 * d4, this.z_Coord + d3 * d4) : null;
        }
    }

    
    public Vec3 getIntermediateWithZValue(Vec3 p_72434_1_, double p_72434_2_)
    {
        double d1 = p_72434_1_.x_Coord - this.x_Coord;
        double d2 = p_72434_1_.y_Coord - this.y_Coord;
        double d3 = p_72434_1_.z_Coord - this.z_Coord;

        if (d3 * d3 < 1.0000000116860974E-7D)
        {
            return null;
        }
        else
        {
            double d4 = (p_72434_2_ - this.z_Coord) / d3;
            return d4 >= 0.0D && d4 <= 1.0D ? createVectorHelper(this.x_Coord + d1 * d4, this.y_Coord + d2 * d4, this.z_Coord + d3 * d4) : null;
        }
    }

    public String toString()
    {
        return "(" + this.x_Coord + ", " + this.y_Coord + ", " + this.z_Coord + ")";
    }

    
    public void rotateAroundX(float p_72440_1_)
    {
        float f1 = MathHelper.cos(p_72440_1_);
        float f2 = MathHelper.sin(p_72440_1_);
        double d0 = this.x_Coord;
        double d1 = this.y_Coord * (double)f1 + this.z_Coord * (double)f2;
        double d2 = this.z_Coord * (double)f1 - this.y_Coord * (double)f2;
        this.setComponents(d0, d1, d2);
    }

    
    public void rotateAroundY(float p_72442_1_)
    {
        float f1 = MathHelper.cos(p_72442_1_);
        float f2 = MathHelper.sin(p_72442_1_);
        double d0 = this.x_Coord * (double)f1 + this.z_Coord * (double)f2;
        double d1 = this.y_Coord;
        double d2 = this.z_Coord * (double)f1 - this.x_Coord * (double)f2;
        this.setComponents(d0, d1, d2);
    }

    
    public void rotateAroundZ(float p_72446_1_)
    {
        float f1 = MathHelper.cos(p_72446_1_);
        float f2 = MathHelper.sin(p_72446_1_);
        double d0 = this.x_Coord * (double)f1 + this.y_Coord * (double)f2;
        double d1 = this.y_Coord * (double)f1 - this.x_Coord * (double)f2;
        double d2 = this.z_Coord;
        this.setComponents(d0, d1, d2);
    }
}