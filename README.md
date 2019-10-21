# MVP

An approach to develop UIs using the [Model-View-Presenter](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter) Pattern more comfortable under Vaadin 14. Programming MVP in Vaadin was already possible before, but extending the [Presenter](https://github.com/appreciated/mvp-flow/blob/master/src/main/java/com/github/appreciated/mvp/Presenter.java) class gives the user a more predefined strucure to rely on.

## Development instructions

Starting the test/demo server:
1. Run `mvn jetty:run`.
2. Open http://localhost:8080 in the browser.

## Publishing to Vaadin Directory

You can create the zip package needed for [Vaadin Directory](https://vaadin.com/directory/) using
```
mvn versions:set -DnewVersion=1.0.0 # You cannot publish snapshot versions 
mvn install -Pdirectory
```

The package is created as `target/mvp-flow-1.0.0.zip`

For more information or to upload the package, visit https://vaadin.com/directory/my-components?uploadNewComponent
