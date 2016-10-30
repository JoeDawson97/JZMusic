package entity;

public class DrumPattern {
	
	private int id;
	private int bit;
	private boolean[] dong;
	private boolean[] ci;
	private boolean[] da;
	
	public DrumPattern(int id){
		this.dong = new boolean[16];
		this.ci = new boolean[16];
		this.da = new boolean[16];
		
		for(int i=0;i<16;i++){
			dong[i] = false;
			ci[i] = false;
			da[i] = false;
		}
		
		this.id = id;
		this.bit = 4;
	}
	
	public DrumPattern(int id,int bit){
		this.dong = new boolean[16];
		this.ci = new boolean[16];
		this.da = new boolean[16];
		
		for(int i=0;i<16;i++){
			dong[i] = false;
			ci[i] = false;
			da[i] = false;
		}
		
		this.id = id;
		this.bit = bit;
	}

}
