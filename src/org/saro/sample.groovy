package org.saro
class Saro implements Serializable {
  def env
  def steps
  Utilities(env, steps) {
    this.env = env
    this.steps = steps
  }

  def mvn(args) {
    steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
}
