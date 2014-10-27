def r = benchmark {        // use 'new groovyx.gbench.BenchmarkBuilder().run {' in Groovy 1.8 or earlier.
    'StringBuilder' {
        def sb = new StringBuilder()
        sb.append('foo')
        sb.append('bar')
        sb.append('baz')
        sb.toString()
    }
    'StringBuffer' {
        def sb = new StringBuffer()
        sb.append('foo')
        sb.append('bar')
        sb.append('baz')
        sb.toString()
    }
}
r.prettyPrint()