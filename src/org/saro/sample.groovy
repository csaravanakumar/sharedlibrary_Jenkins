package org.saro
class sample implements Serializable {
  def env
  def steps
  sample(env, steps) {
    this.env = env
    this.steps = steps
  }

  def mvn(args) {
    steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
}
