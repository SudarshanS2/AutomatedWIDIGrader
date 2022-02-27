package com.widi;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello");
        String pathToRubric = "C:\\Users\\Sudarshan Srinivasan\\IdeaProjects\\AutomatedWIDIGrader\\images\\Dinosaur.jpg";
        String pathToGradingFile = "C:\\Users\\Sudarshan Srinivasan\\IdeaProjects\\AutomatedWIDIGrader\\images\\Dinosaur.jpg";

        Grader widiGrader = new Grader(pathToRubric);
    }
}
