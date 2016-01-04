package io.github.mecorp.mineralessentials.random;

import io.github.mecorp.mineralessentials.random.eyeglass.EyeGlass;
import io.github.mecorp.mineralessentials.random.glasses.Glasses;
import io.github.mecorp.mineralessentials.random.headset.Headset;
import io.github.mecorp.mineralessentials.random.labcoat.Labcoat;
import io.github.mecorp.mineralessentials.random.wings.Wings;

/**
 * Created by untamemadman on 08/04/2015.
 */

public class Random
{
    public static void RegisterRandom()
    {
        Glasses.RegisterGlasses();
        Headset.RegisterHeadset();
        EyeGlass.RegisterEyeGlass();
        Labcoat.RegisterLabcoat();
        Wings.RegisterWings();
    }
}
