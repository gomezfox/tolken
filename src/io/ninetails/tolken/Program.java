package io.ninetails.tolken;

import java.util.ArrayList;

public class Program {
    ArrayList<Section> sections;
    Section defaultSection;
    public void run() {
        // runs sections
        for (Section section : sections) {
            System.out.println(section.toString());
        }
    }
}
