/**
 * 枚举类，继承Enum类
 */
public enum Gender {
    //即为枚举类的对象，public static final Gender MAN = new Gender()
    //匿名内部类
    MAN {
        @Override
        public void show() {
            // super.show();
            System.out.println("MAN");
        }
    },WOMAN("女"),NONE;

    private String gender;

    //默认私有无参构造器
    private Gender() {}

    private Gender(String name) {
        this.gender = name;
    }

    public String getGender() {
        return gender;
    }

    public void show() {
        System.out.println("show");
    }

    @Override
    public String toString() {
        String ret = super.toString();
//        if (this == MAN) {
//            ret = "man";
//        } else if (this == WOMAN) {
//            ret = "woman";
//        } else {
//            ret = "any";
//        }
        switch (this) {
            case MAN:
                ret = "man";
                break;
            case WOMAN:
                ret = "woman";
                break;
            case NONE:
                ret = "any";
        }
        return ret;
    }
}
