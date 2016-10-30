package bussnissLogic.recgnize;

import entity.Note;
import entity.sample.AboveSample;
import entity.sample.BelowSample;
import entity.sample.MidSample;

public interface TranslateService {
	

	public Note translate(AboveSample sample, int index);
	public Note translate(MidSample sample, int index);
	public Note translate(BelowSample sample, int index);
	

}
