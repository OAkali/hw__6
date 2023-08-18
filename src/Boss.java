public class Boss extends GameEntity{
    private WeaponType bossWeapon=WeaponType.SWORD;
    public Boss(){
        super();
    }

    public WeaponType getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(WeaponType bossWeapon) {

        this.bossWeapon = bossWeapon;
    }
    public String printInfo(){
        return "Name: "+getName()+" Healhs "+getHealhs()+" Damage: "+getDamag() ;

    }
}
