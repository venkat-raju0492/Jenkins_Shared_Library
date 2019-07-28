def call(Map stageParams) {
	[buildDiscarder(logrotator(artifactDaysTokeepStr: '',
	artifactNumToKeepStr: "${env.ARTIFACT_BUILD_TO_KEEP}",
	daysToKeepStr: '',numToKeepStr: "${env.NUM_BUILDS_TO_KEEP}")),
	pipelineTriggers([pollscm('''H/15 * * * *''')])]
}
