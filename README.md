# ArrayListとHashSetのcontains速度調査

Javaのコードで時々`java.util.ArrayList`に対してcontainsメソッドを呼び出して検索しているのを見かけるが、`java.util.HashSet`でcontainsメソッドを実行するのとどの程度速度差があるのか検証するためのコード

ベンチマークを取るためにJMHを利用しています

# 推測

1. `ArrayList`は線形探索になるので要素数が増えれば増えるほど遅くなるが、`HashSet`はハッシュ値から直接検索できるため要素が増えても速度が落ちないはずである。
（計算量はArrayListのcontainsがO(N)なのに対してHashSetのそれはO(1)であるため）

1. 要素数が小さいときに速度的には`ArrayList`も`HashSet`とあまり変わらない要素数の領域があるのではないか？あるとしたらどの程度の要素数までなのか？

# 環境

* Java8
* Maven

# 実行方法

リポジトリをclone後、リポジトリのディレクトリに移動して

```
$ mvn clean install
$ java -jar target/benchmarks.jar
```
