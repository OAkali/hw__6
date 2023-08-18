public class Main {
    public static void main(String[] args) {
        Boss bossParameters=new Boss();
        bossParameters.setName("Gen");
        bossParameters.setHealhs(1000);
        bossParameters.setDamag(100);
        System.out.println("Name: "+bossParameters.getName()+" Healhs: "+
                bossParameters.getHealhs()+" Damage: "+bossParameters.getDamag()+" Weapon: "
                +bossParameters.getBossWeapon());
        Skeleton paramet= new Skeleton();
        paramet.setName("Sk1");
        paramet.setHealhs(150);
        paramet.setDamag(50);
        paramet.setArrow(10);
        Skeleton paramet2= new Skeleton();
        paramet2.setName("Sk2");
        paramet2.setHealhs(150);
        paramet2.setDamag(50);
        paramet2.setArrow(15);
        System.out.println(bossParameters.printInfo()+" Weapon: "+bossParameters.getBossWeapon()+
                " "+paramet.printInfo()+" "+ paramet2.printInfo());
        System.out.println(paramet2.printInfo()+" "+paramet.printInfo());



    }
}