package Q5;
// 测试类
public class Main {
    public static void main(String[] args) {
        // TODO:
        // 1. 通过工厂分别创建 Saber、Archer、Caster 三个角色
        // 2. 让每个角色发动攻击（调用 attack）
        // 期待输出格式参考如下：
        // [剑士] 阿尔托莉雅 使用 Excalibur 发动攻击！
        // ...
        Character saber = CharacterFactory.createCharacter(CharacterType.SABER);
        Character archer = CharacterFactory.createCharacter(CharacterType.ARCHER);
        Character caster = CharacterFactory.createCharacter(CharacterType.CASTER);
        saber.attack();
        archer.attack();
        caster.attack();
    }
}
