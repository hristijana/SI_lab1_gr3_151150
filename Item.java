class Item {
	int id;
	String name;
	double price;
	char danok;

	Item (int id, String name, double price, char danok){
		this.id = id;
		this.name = name;
		this.price = price;
		this.danok = danok;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDanok(char danok) {
		this.danok = danok;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public char getDanok() {
		return danok;
	}

double getTaxReturn () {
	float ddv = 0
	if (danok == "A"){
		ddv = price / 100 * 18;
	}
	if (danok == "B"){
		ddv = price / 100 * 5;
	}
	if (danok == "C"){
		ddv = price / 100 * 0;
	}
		float povrat = ddv / 100 * 15;
		return povrat;
	}
}