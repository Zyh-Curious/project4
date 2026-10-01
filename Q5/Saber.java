package Q5;
// 剑士实现
public class Saber implements Character {
    private final String name;
    private final String skill;

    public Saber() {
        this.name = "阿尔托莉雅";
        this.skill = "Excalibur";
    }

    // TODO: 实现 attack 方法，打印格式为："[剑士] 阿尔托莉雅 使用 Excalibur 发动攻击！"
    @Override
    public void attack() {
        System.out.println("[剑士] " + this.name + " 使用 " + this.skill + " 发动攻击！");
    }
}
