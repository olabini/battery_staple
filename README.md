Battery Staple
==============

A simple Java version of a password generator based on this [XKCD comic about password strength](http://xkcd.com/936/). It will by default use [this list](http://world.std.com/~reinhold/diceware.wordlist.asc) of dictionary words and generate 5 word pass phrases. You can also use a custom number of words and a custom dictionary list as arguments.

```shell
$ java -jar battery_staple.jar
correct horse battery staple simple
```

```shell
$ java -jar battery_staple.jar 3
correct horse battery
```

```shell
$ java -jar battery_staple.jar 3 dict.sv
korrekt häst batteri
```

If you are very concerned about security, please inspect the source code for yourself and use the provided build script to build the jar file. The downloadable jar has been made available for convenience and contains the default dictionary list.
