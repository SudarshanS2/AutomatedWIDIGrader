package com.widi;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

import jankovicsandras.imagetracer.ImageTracer;

public class ImageParser
{
    public ImageParser()
    {}

    public static Image loadImage(String path)
    {
        return null;
    }

    public void getCoords() throws Exception
    {
        HashMap<String,Float> options = new HashMap<String,Float>();

        options.put( "ltres", 2f ); // Linear error threshold
        options.put( "qtres", 2f ); // Quadratic spline error threshold

        ImageTracer it = new ImageTracer();
        ImageTracer.IndexedImage myimage = it.imageToTracedata("input.jpg", options, null);

        ArrayList<ArrayList<ArrayList<Double[]>>> myLayers = myimage.layers;
    }

}
