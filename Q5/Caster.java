package Q5;

// 法师实现
public class Caster implements Character {
    private final String name;
    private final String skill;

    public Caster() {
        this.name = "美狄亚";
        this.skill = "Rho Aias";
    }

    // TODO: 实现 attack 方法
    // attack 格式："[法师] 美狄亚 使用 Rho Aias 发动攻击！"
    @Override
    public void attack() {
        System.out.println("[法师] " + this.name + " 使用 " + this.skill + " 发动攻击！");
    }
}
