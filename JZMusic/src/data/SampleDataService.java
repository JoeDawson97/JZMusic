package data;

import java.util.ArrayList;

import entity.sample.*;

public interface SampleDataService {
	
	ArrayList<AboveSample> getAboveSample();
	ArrayList<MidSample> getMidSample();
	ArrayList<BelowSample> getBelowSample();
	ArrayList<RarenthesisSample> getRarenthesisSample();
	ArrayList<TrackSample> getTrackSample();
	ArrayList<InstructionSample> getInstructionSample();

}
