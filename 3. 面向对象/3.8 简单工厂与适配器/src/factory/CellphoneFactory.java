package factory;

/**
 * 简单工厂,屏蔽子类之间的差异
 */
public class CellphoneFactory {
    public static ICellPhone getInstance(String type) {
        if ("iphone".equals(type)){
            return new IPhone();
        } else if ("android".equals(type)) {
            return new Android();
        } else {
            return null;
        }
    }
}
