> Stream 是 1.8 引入的新特性

# 尝试 Stream
现在我们有多个设备(Divices)实体存储在 divicesList 里
我们需要筛选出价格小于 30 的设备名称

在没有stream 的时候，我们必需这样做

```
List<String> lowNumList=new ArrayList<>();
for (Divices divices:divicesList
     ) {
    if (divices.getPrice()<30){
        lowNumList.add(divices.getName());
    }

}
```
在使用 stream 之后，我们通过下面的方式就可以实现上面的功能
```
List<String> lowNumList=
                divicesList.stream()
                .filter(d->d.getPrice()<30)
                .map(Divices::getName)
                .collect(toList());
```
# 流和集合
看完流的操作，或许你会觉得————这好像也没有简洁多少。有必要吗？

别忘了 foreach 只是 Java 提供的语法糖，内部依然是基于普通的 for 循环或迭代器实现的。

除此之外 stream 还有如下两个特性
## 1.内部迭代
与 for 循环不同，stream 使用的是内部迭代。
内部迭代可以透明的进行并行处理，说人话就是————你不再需要对多线程情况下的迭代进行额外的处理了。
## 2.按需计算
此外，stream 可以进行按需计算和加载
