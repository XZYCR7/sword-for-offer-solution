

## 关键：将循环变成递归操作，每次折半求值，避免死板做循环，这种感觉像加法变乘法。

### 注意细节：底数为 0 的时候，指数为负数是没有意义的

### 精确计算，转成浮点数 0.125
System.out.println((double) 1 / 8);

### 右移 1 位运算等价于 除以 2
// exponent 指数，exponent >> 1 表示将指数除以 2
System.out.println(exponent >> 1);


### 使用位运算的 与 运算符代替了求余数运算，来判断一个数是奇数还是偶数
if ((exponent & 1) == 0) {