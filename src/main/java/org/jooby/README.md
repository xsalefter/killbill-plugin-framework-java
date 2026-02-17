Files under this directory are verbatim-copy of jooby-1.6.9. Some modification written below.

- The `org/jooby/LifeCycle.java`'s `PostConstruct` and `PreDestroy` package moved to use `jakarta` namespace.
- The `src/test/java/org/jooby/RouteDefinitionTest.java`'s `src()` tests removed.
- The `src/test/java/org/jooby/internal/RequestScopeTest.java`'s `circularScopedValue()` tests removed, 
  because asking very specifics guice:4.2.3 `import com.google.inject.internal.CircularDependencyProxy;` 