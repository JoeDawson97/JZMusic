package bussnissLogic.recgnize;

import entity.Multistrokes;
import entity.sample.Sample;

public interface RecognizeService {
	
	public Sample recognize(Multistrokes strokes);

}
