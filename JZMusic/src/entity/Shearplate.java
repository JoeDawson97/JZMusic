package entity;

import java.util.ArrayList;

public class Shearplate {
    private int begin;
    private int end;
    private ArrayList<Track> tracks;
    private DrumPoint drum;
    
    public Shearplate(int begin,int end,ArrayList<Track> tracks,DrumPoint drum){
    	this.begin = begin;
    	this.end = end;
    	this.tracks = tracks;
    	this.drum = drum;
    }
    
    public Shearplate(int begin,int end){
    	this.begin = begin;
    	this.end = end;
    }
}
