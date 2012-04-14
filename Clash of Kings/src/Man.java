class Man{
	String name;
	Banner house;
	
	//bonus given to a city if this person is put in command of it
	CBonus citybonus;	
	
	//bonus given to a unit if this person is put in command of it
	UBonus unitbonus;	
	
	/*bonus given to/against a Banner or King if this person is captured
	ie if Stannis captures Ser Loras, he will get diplomacy bonuses
	when treating with House Tyrell. */
	CapBonus captivebonus;
	
	/* if they're not married/betrothed, they can be used as 
	"bargaining chips" with other Mans and Banners */
	boolean betrothedp;				
	
	//position on the map,
	Posn p;		
	
	/* Banner that currently holds this person. 
	 If they are free, captor = house */
	Banner captor;	
	
	Family family;
	
	ILo<City> cities;
	
	ILo<Land> lands;
}