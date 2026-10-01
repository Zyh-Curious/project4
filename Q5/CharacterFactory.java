package Q5;

public class CharacterFactory {
    // TODO: 实现工厂方法，根据角色类型返回对应的角色对象
    // 提示：如果传入未知类型，可以抛出 IllegalArgumentException
    public static Character createCharacter(CharacterType type) {
        return switch (type) {
            case SABER -> new Saber();
            case ARCHER -> new Archer();
            case CASTER -> new Caster();
            default -> throw new IllegalArgumentException("未知角色类型");
        };
    }
}
