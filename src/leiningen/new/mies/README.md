# {{name}}

FIXME: Write a one-line description of your library/project.

## Overview

FIXME: Write a paragraph about the library/project and highlight its goals.

## Setup

First-time Clojurescript developers, add the following to your bash .profile:

    export LEIN_FAST_TRAMPOLINE=y
    alias cljsbuild="lein trampoline cljsbuild $@"

To avoid compiling ClojureScript for each build, AOT Clojurescript locally in your project with the following:

    ./scripts/compile_cljsc

Subsequent dev builds can use:

    lein cljsbuild auto dev

To start a Node REPL (requires rlwrap):

    ./scripts/repl

To get source map support in the Node REPL:

    lein npm install
    
To start a browser REPL:
    
    1. Make sure lein cljsbuild is running in background 
    2. Uncomment the following line in src/[project name]/core.cljs: 
       ;; (repl/connect "http://localhost:9000/repl")
    3. In terminal enter: 
          lein cljsbuild repl-listen
          You should see this:
             Running ClojureScript REPL, listening on port 9000.
             Compiling client js ...
             Waiting for browser to connect ...
             To quit, type: :cljs/quit
    4. Browse to http://localhost:9000 (you should see Hello World! in web console)
    5. (back to step 3) you should now see the REPL prompt: ClojureScript:cljs.user> 
    6. You may now evaluate ClojureScript statements in the browser context. 
    
For more info using the browser as REPL environment, see [this](https://github.com/clojure/clojurescript/wiki/The-REPL-and-Evaluation-Environments#browser-as-evaluation-environment).
    

Clean project specific out:

    lein clean
     
Optimized builds:

    lein cljsbuild once release     

For more info on Cljs compilation, read [Waitin'](http://swannodette.github.io/2014/12/22/waitin/).

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
