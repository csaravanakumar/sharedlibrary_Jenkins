job('example') {
  steps {
    shell('echo from git sample_Vrnaplex')
    simple.sample.call()
  }
}
