package chapter02;

public class Tv {
	private int channel;
	private int volume;
	private boolean power;
	
	public Tv(){
		
	}
	public Tv(int channel,int volume,boolean power){
		this.channel=channel;
		this.volume=volume;
		this.power=power;
		}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;
	}
	
	void power(boolean on){
		 this.power=on;
	}
	
	void channel(int channel){
		 if(channel>255)
			 this.channel=1;
		 
		 if(channel<0)
			 this.channel=255;
		 
	this.channel=channel;
		 
		 
	}
	void channel(boolean up){
		if(up){
			if(channel<255){
			channel++;
			}
		}else{
			channel--;
		}
	}
	void volume(int volume){
		 if(volume>100)
			 this.volume=volume-100;
		 
		 if(volume<0)
			 this.volume=255;
		 
	this.volume=volume;
	}
	void volume(boolean up){
		if(up){
			volume++;
		
			}
			
		else{
			volume--;
		}
	}
	void status(){
		System.out.println("채널:"+channel+"볼륨:"+volume+"전원"+power);
	}
}

