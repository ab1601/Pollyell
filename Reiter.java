public class Reiter {
	// количество побед и вероятность,с которой наездника выбивают из седла
	int siege;
	float wahrscheinlichkeit;


	public Reiter(int siege, float wahrscheinlichkeit, boolean sitztImSattel) {
		this.siege = siege;
		this.wahrscheinlichkeit = wahrscheinlichkeit;
	}

	public int getSiege() {
		return siege;
	}

	public void setSiege(int siege) {
		this.siege = siege;
	}

	public float getWahrscheinlichkeit() {
		return wahrscheinlichkeit;
	}

	public void setWahrscheinlichkeit(float wahrscheinlichkeit) {
		this.wahrscheinlichkeit = wahrscheinlichkeit;
	}

}
