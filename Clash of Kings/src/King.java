public class King{
	Man king;
	ILo<City> cities;
	ILo<Banner> banners;
	ILo<Land> lands;
	Family family;
	int food;
	int gold;
	int charisma;
	int moral;
	int honor;
	
	King(Man king, ILo<Banner> banners, int food, int gold, 
			int charisma, int moral, int honor){
		this.king = king;
		this.cities = this.king.cities.append(this.banners.getCities());
		this.banners = banners;
		this.lands = this.king.lands.append(this.banners.getLands());
		this.family = this.king.family;
		this.food = food;
		this.gold = gold;
		this.charisma = charisma;
		this.moral = moral;
		this.honor = honor;
	}
}