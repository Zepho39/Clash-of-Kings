import java.util.ArrayList;

// list of cities
class CityList extends ArrayList<City> { }

// list of persons
class ManList extends ArrayList<Man> { }

// list of banners
class BannerList extends ArrayList<Banner> { }

// etc.



class Knowledge {
    InfoOwn otherUnits;
    InfoOther ownUnits;
    InfoTerr genTerrain;
    InfoBanner otherBanners;
    InfoCity city;
}

class InfoCity {
    ArrayList<City> cities;
    
    cities.leader;
    cities.happiness;
    cities.militancy;
    cities.stores;
}

class InfoBanner {
    ArrayList<BannerFamily> banners;

    banners.relation;
    banners.provinces;
}

class InfoOwn {
    ArrayList<Units> units;
    
    units.location;
    units.morale;
    units.makeUp;
    units.mission;
}

class InfoOther {
    ArrayList<Units> units;
    
    units.location;
    units.makeUp;
}

class InfoTerr {
    Array terr;
    terr.fortification;
}

class Actor {
    Map m;

    // some way of representing what the actors know
}

abstract class Unit {
    Knowledge k;
    Mission m;
    Man leader;
}

class LandUnit extends Unit {
    Integer knights;
    Integer infantry;
    Integer siege;
}

class SeaUnit extends Unit {
    Integer frigate;
    Integer transport;
    Integer other;
}

// all actors mutate the map

class Map {
    KingList kings;
    BannerList indepBanners;
    
    ProvinceList prov;
}

class King extends BannerFamily implements {
    Man leader;
    ManList family;
    
    UnitList peons;

    // know method that tells king everything he knows abt banners
    BannerList banners;
}

class BannerFamily implements {
    Man leader;
    ManList family;
    
    ArrayList<String> provs;

    UnitList peons;
}