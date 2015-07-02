# mies

A minimal ClojureScript template.

## Usage

To create a new project: 
```
lein new mies hello-world
cd hello-world
```

To avoid compiling ClojureScript for each build, AOT Clojurescript locally in your project with the following:
```
./scripts/compile_cljsc
```

To compile a developer build version:
```
lein cljsbuild once dev
```

To continuously monitor source files and build when changed:
```
lein cljsbuild auto dev
```

To compile a release version:
```
lein cljsbuild once release
```

## License

Copyright © 2013-2015 David Nolen

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
