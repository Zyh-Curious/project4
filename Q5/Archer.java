package Q5;


// 弓兵实现
public class Archer implements Character {
    private final String name;
    private final String skill;

    public Archer() {
        this.name = "卫宫";
        this.skill = "Unlimited Blade Works";
    }

    // TODO: 实现 attack 方法
    // attack 格式："[弓兵] 卫宫 使用 Unlimited Blade Works 发动攻击！"
    @Override
    public void attack() {
        System.out.println("[弓兵] " + this.name + " 使用 " + this.skill + " 发动攻击！");
    }
}
