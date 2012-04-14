class Banner{
	String name;
	King king;
	int men;
	int knights;
	Man head;							//Head of the household
	int navy;
	int $tokingperturn;					//Money given to the King per turn
	int $generatedperturn;				//Money generated per turn
	int money;
	int food;							//Function of units, cities, King's orders, and last turn's food
	City seat;							//Home of this house
	ILo<City> cities;
	ILo<Unit> units;							//Keeps track of all this houses units
	ILo<Land> lands;							//Lands under this house's control
	int moral;
	ILo<Family> family;							//Taken from head
	int tax;									//% of money to be given to the King every turn
	
	Banner(String name, King king, int men, int knights, Man head, int navy, 
			int money, int food, City seat, ILo<City> cities, ILo<Land> lands, int moral,
			ILo<Family> family){
		this.name = name;
		this.king = king;
		this.men = men;
		this.knights = knights;
		this.head = head;
		this.navy = navy;
		this.$tokingperturn = (this.tax * this.$generatedperturn);
		this.$generatedperturn = 
	}
	
}