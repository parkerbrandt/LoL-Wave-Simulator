package com.parkerbrandt.wavesim;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Application implements Runnable {

    //****************************************
    // Public Class Members
    //****************************************
    public static final String      DEFAULT_NAME = "Wave Simulator";
    public static final Dimension   DEFAULT_SIZE = new Dimension(1280, 720);


    //****************************************
    // Constructors
    //****************************************

    /**
     * Base Constructor for Application class
     * @param args command-line arguments (unused right now)
     */
    public Application(String[] args) { }


    //****************************************
    // Main Function
    //****************************************

    /**
     * Main Method
     * Start of Program Logic
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Begin running the application
        SwingUtilities.invokeLater(new Application(args));
    }


    //****************************************
    // Runnable Override Methods
    //****************************************
    @Override
    public void run() {

    }
}
