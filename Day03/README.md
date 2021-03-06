# 问题记录
- 对于成员变量、成员方法等概念的别名以及理解不清楚
- Java无法查找简单数据类型的地址

# Day03知识总结
### 1.Java变量与常量
- 变量的声明格式：
    1.先声明，后赋值。
    2.声明并赋值
- 变量的分类：全局变量、局部变量

- 需要注意的地方有：

1. 在成员方法中，可以直接访问类的成员变量（全局变量）
    不管成员变量是否赋初始值，都可以直接使用
2. 局部变量只声明不赋初值不能使用
3. 全局变量只声明不赋初始值也可以使用，默认会赋值，该值与变量的数据类型有关
4. 如果在变量前面加修饰符final，则该变量就会变成常量，一旦赋值，就不能修改
5. 主函数中不能直接使用全局变量，要想使用，方法有二：
    一、通过创建一个对象来使用；
    二、通过给变量添加修饰符static
6. 全局变量与局部变量可以同名，但不建议这么做，容易混淆。

### 2.简单数据类型
- 数据类型分为：
    简单数据类型，也叫基本数据类型；
    复合数据类型，也叫引用数据类型。
- 其中，简单数据类型有四大类：整型、浮点型、字符型（char）、布尔类型（boolean）
    而整型又分为 byte字节型、short短整型、int整型、long长整型；
    浮点型分为 float单精度浮点型、double双精度浮点型。
- 需要注意的点：
1. 布尔类型的值只有true、false；不能像C语言那样用0和非0代替。
2. 赋值号=右边的值就是字面量
3. 声明为长整型long而又没有在后面加L或l时，如果该值在int的范围内，则不会报错；否则报错
4. 字符型数据的字面量可以是 数字，字符，Unicode编码。前提是一个字符位，否则报错。


