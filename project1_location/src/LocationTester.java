public class LocationTester{
    public static void main(String[] args) {
        // موقعي الحالي
        NamedLocation myPlace = new NamedLocation(32.85167, 12.03563, "مكاني");

        // كلية تقنية المعلومات جامعة صبراتة
        NamedLocation itCollege = new NamedLocation(32.85275, 12.06153, "كلية تقنية المعلومات جامعة صبراتة");

        // استخدام Overriding: طباعة مخصصة
        myPlace.printLocation();
        itCollege.printLocation();

        //  استخدام Overloading: حساب المسافة باستخدام الكائن
        double distance1 = myPlace.distanceTo(itCollege);
        System.out.println("المسافة باستخدام الكائن : " + distance1 + " كم");

        //  استخدام Overloading: حساب المسافة باستخدام باستخدام الاحداثيات مباشرة
        double distance2 = myPlace.distanceTo(32.85275, 12.06153);
        System.out.println("المسافة باستخدام الاحداثيات مباشرة : " + distance2 + " كم");
    }
}