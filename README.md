# lambda-zipper

A Clojurescript and node app to turn js files into zips for consumption by aws lambda.

The test.js file is included as a sample.

## Usage

```
lein npm install
lein cljsbuild once
node zipper.js test.js
```

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
