## 面向对象
### 一、继承
>类与类之间的关系
#### 1.重写和重载
##### 重载
1）同一个类中 

2）方法名相同，参数列表不同 

3）返回值不做限制 

4）与参数名无关

##### 重写
1）有继承关系的类当中 

2）方法名、参数列表列表相同。返回值可以是子类类型

3）访问修饰符允许有变化 

4）与方法参数名无关


#### 2.equals和toString

##### equals

1）继承Object类中的equals方法，比较两个引用是否指向同一个对象

2）子类可以通过重写equals方法的形式，改变比较的内容

##### toString

1）输出对象名时，会默认调用toString

2）继承Object类中的toString方法时，输出对象的字符串表示形式：类型信息+@+地址信息

3）子类可以通过重写toString方法的形式，改变输出的内容

#### 3.final关键字
>final class表示最终的，不允许有子类
~~~
final public class Animal{


}
~~~
>final 方法表示该方法不允许被重写，但是可以被子类正常使用
~~~
final public void run(){

}
~~~
>final修饰方法内的局部变量：只要在具体被使用之前进行赋值即可，一旦赋值不允许被修改

>final修饰类中的成员属性：1.定义直接初始化 2.构造方法 3.构造代码块

### 二、多态
> 允许不同类的对象对同一消息做出不同反应

编译时多态——方法重载

运行时多态——程序运行时动态决定调用哪个方法

这里的多态指运行时多态

必要条件：满足继承关系 父类引用指向子类对象

#### 1.向上转型、隐式转型、自动转型
父类引用指向子类实例 小类型转为大类型 

可以调用子类重写父类的方法以及父类派生的方法 无法调用子类独有的方法

#### 2.向下转型、强制类型转换
子类引用指向父类对象，此处必须进行强转，可以调用子类特有的方法

注：父类中的静态方法子类不能重写，所以向上转型之后，只能调用到父类原有的静态方法

### 三、抽象类

#### 抽象类
不能直接实例化，只能被继承，可以通过向上转型完成对象实例

#### 抽象方法
不允许包含方法体；子类中需要重写父类的抽象方法，否则子类也是抽象类
~~~
public abstract void eat();
~~~

### 四、接口

>接口定义了某一批所需要遵守的规范
接口不关心这些类的内部数据，也不关心这些类里方法的实现细节，它只规定这些类里必须提供某些方法

接口中方法默认public，实现该接口的类中需要有接口的所有默认方法
#### 1.default关键字修饰方法
默认方法，可以带方法体 可以在实现类中重写，并可以通过接口引用调用
#### 2.接口中的常量
默认public static final
#### 3.static关键字修饰方法
静态方法 可以带方法体 不可以在实现类中重写，可以通过接口名调用
#### 4.接口的继承
接口可以继承，并且可以继承多个父接口
~~~
public interface A{

}

public interface B{

}

public interface C extend A,B{

}

~~~

### 五、内部类
#### 1.成员内部类
1)内部类在外部使用时，无法直接实例化，需要借助外部类信息才能完成实例化

2）内部类的访问修饰符，可以任意，但是访问范围会受到影响

3）内部类可以直接访问外部类成员；如果出现同名属性，优先访问内部类中定义的

4）可以使用外部类.this.成员的方式，访问外部类中同名的信息

5）外部类访问内部类信息，需要通过内部实例，无法直接访问

6）内部类编译之后.class文件命名：外部类$内部类.class

7）内部类中可以包含与外部类相同的名称的方法
#### 2.静态内部类
1）静态内部类中，只能直接访问外部类的静态方法，如果需要调用非静态方法，可以通过对象实例实现

2）静态内部类对象实例时，可以不依赖于外部类对象

3）可以通过外部类.内部类.静态成员的方式，访问内部类中的静态成员

4）当内部类属性与外部类属性同名时，默认直接调用内部类中的成员

如果需要访问外部类中的静态属性，则可以通过 外部类.属性 的方式

如果需要访问外部类中的非静态属性，则可以通过 new 外部类().属性 的方式

#### 3.方法内部类
>定义在方法中的内部类

1）定义在方法内部，作用范围也在方法内

2）和方法内部成员使用规则一样，class前面不可以添加public private protected static

3）类中不能包含静态成员

4）类中可以包含final、abstract修饰成员
#### 4.匿名内部类
>适用场景 只用到类的一个实例 类在定义后马上用到 给类命名并不会导致代码更容易被理解

1）匿名内部类没有类型名称、实例对象名称

2）编译后的文件命名：外部类$数字.class

3）无法使用private public protected abstract static修饰

4）无法编写构造方法，可以添加构造代码块

5）不能出现静态成员

6）匿名内部类可以实现接口也可以继承父类，但是不可兼得

## Java其他
### 一、异常
>程序运行期间的错误
#### 1.try catch finally
try:抛出异常

catch：捕获异常

finally：一定会被执行