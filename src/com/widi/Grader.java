package com.widi;

public class Grader
{
    private String rubricPath;

    public Grader()
    {
        rubricPath = "";
    }

    public Grader(String pathToRubric)
    {
        rubricPath = pathToRubric;
    }

    public void setRubric(String pathToRubric)
    {
        rubricPath = pathToRubric;
    }

    private int importPicture(String path)
    {
        //take in path, return picture.
        return 0;
    }
}
