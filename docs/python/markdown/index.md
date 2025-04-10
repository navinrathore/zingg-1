# Python API

## Zingg Entity Resolution Python Package

Zingg Python APIs for entity resolution, identity resolution, record linkage, data mastering and deduplication using ML ([https://www.zingg.ai](https://www.zingg.ai))

**NOTE**

Requires **python 3.6+**; **spark 3.5.0.** Otherwise, [`zingg.client.Zingg()`](zingg.md#zingg.client.Zingg) cannot be executed

* [Zingg Entity Resolution Package](zingg.md)
  * [zingg.client](zingg.md#zingg-client)
  * [`Arguments`](zingg.md#zingg.client.Arguments)
    * [`Arguments.copyArgs()`](zingg.md#zingg.client.Arguments.copyArgs)
    * [`Arguments.createArgumentsFromJSON()`](zingg.md#zingg.client.Arguments.createArgumentsFromJSON)
    * [`Arguments.createArgumentsFromJSONString()`](zingg.md#zingg.client.Arguments.createArgumentsFromJSONString)
    * [`Arguments.getArgs()`](zingg.md#zingg.client.Arguments.getArgs)
    * [`Arguments.getModelId()`](zingg.md#zingg.client.Arguments.getModelId)
    * [`Arguments.getZinggBaseModelDir()`](zingg.md#zingg.client.Arguments.getZinggBaseModelDir)
    * [`Arguments.getZinggBaseTrainingDataDir()`](zingg.md#zingg.client.Arguments.getZinggBaseTrainingDataDir)
    * [`Arguments.getZinggModelDir()`](zingg.md#zingg.client.Arguments.getZinggModelDir)
    * [`Arguments.getZinggTrainingDataMarkedDir()`](zingg.md#zingg.client.Arguments.getZinggTrainingDataMarkedDir)
    * [`Arguments.getZinggTrainingDataUnmarkedDir()`](zingg.md#zingg.client.Arguments.getZinggTrainingDataUnmarkedDir)
    * [`Arguments.setArgs()`](zingg.md#zingg.client.Arguments.setArgs)
    * [`Arguments.setColumn()`](zingg.md#zingg.client.Arguments.setColumn)
    * [`Arguments.setData()`](zingg.md#zingg.client.Arguments.setData)
    * [`Arguments.setFieldDefinition()`](zingg.md#zingg.client.Arguments.setFieldDefinition)
    * [`Arguments.setLabelDataSampleSize()`](zingg.md#zingg.client.Arguments.setLabelDataSampleSize)
    * [`Arguments.setModelId()`](zingg.md#zingg.client.Arguments.setModelId)
    * [`Arguments.setNumPartitions()`](zingg.md#zingg.client.Arguments.setNumPartitions)
    * [`Arguments.setOutput()`](zingg.md#zingg.client.Arguments.setOutput)
    * [`Arguments.setStopWordsCutoff()`](zingg.md#zingg.client.Arguments.setStopWordsCutoff)
    * [`Arguments.setTrainingSamples()`](zingg.md#zingg.client.Arguments.setTrainingSamples)
    * [`Arguments.setZinggDir()`](zingg.md#zingg.client.Arguments.setZinggDir)
    * [`Arguments.writeArgumentsToJSON()`](zingg.md#zingg.client.Arguments.writeArgumentsToJSON)
    * [`Arguments.writeArgumentsToJSONString()`](zingg.md#zingg.client.Arguments.writeArgumentsToJSONString)
  * [`ClientOptions`](zingg.md#zingg.client.ClientOptions)
    * [`ClientOptions.COLUMN`](zingg.md#zingg.client.ClientOptions.COLUMN)
    * [`ClientOptions.CONF`](zingg.md#zingg.client.ClientOptions.CONF)
    * [`ClientOptions.EMAIL`](zingg.md#zingg.client.ClientOptions.EMAIL)
    * [`ClientOptions.LICENSE`](zingg.md#zingg.client.ClientOptions.LICENSE)
    * [`ClientOptions.LOCATION`](zingg.md#zingg.client.ClientOptions.LOCATION)
    * [`ClientOptions.MODEL_ID`](zingg.md#zingg.client.ClientOptions.MODEL\_ID)
    * [`ClientOptions.PHASE`](zingg.md#zingg.client.ClientOptions.PHASE)
    * [`ClientOptions.REMOTE`](zingg.md#zingg.client.ClientOptions.REMOTE)
    * [`ClientOptions.ZINGG_DIR`](zingg.md#zingg.client.ClientOptions.ZINGG\_DIR)
    * [`ClientOptions.getClientOptions()`](zingg.md#zingg.client.ClientOptions.getClientOptions)
    * [`ClientOptions.getConf()`](zingg.md#zingg.client.ClientOptions.getConf)
    * [`ClientOptions.getLocation()`](zingg.md#zingg.client.ClientOptions.getLocation)
    * [`ClientOptions.getOptionValue()`](zingg.md#zingg.client.ClientOptions.getOptionValue)
    * [`ClientOptions.getPhase()`](zingg.md#zingg.client.ClientOptions.getPhase)
    * [`ClientOptions.hasLocation()`](zingg.md#zingg.client.ClientOptions.hasLocation)
    * [`ClientOptions.setOptionValue()`](zingg.md#zingg.client.ClientOptions.setOptionValue)
    * [`ClientOptions.setPhase()`](zingg.md#zingg.client.ClientOptions.setPhase)
  * [`FieldDefinition`](zingg.md#zingg.client.FieldDefinition)
    * [`FieldDefinition.getFieldDefinition()`](zingg.md#zingg.client.FieldDefinition.getFieldDefinition)
    * [`FieldDefinition.setStopWords()`](zingg.md#zingg.client.FieldDefinition.setStopWords)
    * [`FieldDefinition.stringify()`](zingg.md#zingg.client.FieldDefinition.stringify)
  * [`Zingg`](zingg.md#zingg.client.Zingg)
    * [`Zingg.execute()`](zingg.md#zingg.client.Zingg.execute)
    * [`Zingg.executeLabel()`](zingg.md#zingg.client.Zingg.executeLabel)
    * [`Zingg.executeLabelUpdate()`](zingg.md#zingg.client.Zingg.executeLabelUpdate)
    * [`Zingg.getArguments()`](zingg.md#zingg.client.Zingg.getArguments)
    * [`Zingg.getMarkedRecords()`](zingg.md#zingg.client.Zingg.getMarkedRecords)
    * [`Zingg.getMarkedRecordsStat()`](zingg.md#zingg.client.Zingg.getMarkedRecordsStat)
    * [`Zingg.getMatchedMarkedRecordsStat()`](zingg.md#zingg.client.Zingg.getMatchedMarkedRecordsStat)
    * [`Zingg.getOptions()`](zingg.md#zingg.client.Zingg.getOptions)
    * [`Zingg.getUnmarkedRecords()`](zingg.md#zingg.client.Zingg.getUnmarkedRecords)
    * [`Zingg.getUnmatchedMarkedRecordsStat()`](zingg.md#zingg.client.Zingg.getUnmatchedMarkedRecordsStat)
    * [`Zingg.getUnsureMarkedRecordsStat()`](zingg.md#zingg.client.Zingg.getUnsureMarkedRecordsStat)
    * [`Zingg.init()`](zingg.md#zingg.client.Zingg.init)
    * [`Zingg.initAndExecute()`](zingg.md#zingg.client.Zingg.initAndExecute)
    * [`Zingg.processRecordsCli()`](zingg.md#zingg.client.Zingg.processRecordsCli)
    * [`Zingg.processRecordsCliLabelUpdate()`](zingg.md#zingg.client.Zingg.processRecordsCliLabelUpdate)
    * [`Zingg.setArguments()`](zingg.md#zingg.client.Zingg.setArguments)
    * [`Zingg.setOptions()`](zingg.md#zingg.client.Zingg.setOptions)
    * [`Zingg.writeLabelledOutput()`](zingg.md#zingg.client.Zingg.writeLabelledOutput)
    * [`Zingg.writeLabelledOutputFromPandas()`](zingg.md#zingg.client.Zingg.writeLabelledOutputFromPandas)
  * [`ZinggWithSpark`](zingg.md#zingg.client.ZinggWithSpark)
  * [`getDfFromDs()`](zingg.md#zingg.client.getDfFromDs)
  * [`getGateway()`](zingg.md#zingg.client.getGateway)
  * [`getJVM()`](zingg.md#zingg.client.getJVM)
  * [`getPandasDfFromDs()`](zingg.md#zingg.client.getPandasDfFromDs)
  * [`getSparkContext()`](zingg.md#zingg.client.getSparkContext)
  * [`getSparkSession()`](zingg.md#zingg.client.getSparkSession)
  * [`getSqlContext()`](zingg.md#zingg.client.getSqlContext)
  * [`initClient()`](zingg.md#zingg.client.initClient)
  * [`initDataBricksConectClient()`](zingg.md#zingg.client.initDataBricksConectClient)
  * [`initSparkClient()`](zingg.md#zingg.client.initSparkClient)
  * [`parseArguments()`](zingg.md#zingg.client.parseArguments)
  * [zingg.pipes](zingg.md#zingg-pipes)
  * [`BigQueryPipe`](zingg.md#zingg.pipes.BigQueryPipe)
    * [`BigQueryPipe.CREDENTIAL_FILE`](zingg.md#zingg.pipes.BigQueryPipe.CREDENTIAL\_FILE)
    * [`BigQueryPipe.TABLE`](zingg.md#zingg.pipes.BigQueryPipe.TABLE)
    * [`BigQueryPipe.TEMP_GCS_BUCKET`](zingg.md#zingg.pipes.BigQueryPipe.TEMP\_GCS\_BUCKET)
    * [`BigQueryPipe.VIEWS_ENABLED`](zingg.md#zingg.pipes.BigQueryPipe.VIEWS\_ENABLED)
    * [`BigQueryPipe.setCredentialFile()`](zingg.md#zingg.pipes.BigQueryPipe.setCredentialFile)
    * [`BigQueryPipe.setTable()`](zingg.md#zingg.pipes.BigQueryPipe.setTable)
    * [`BigQueryPipe.setTemporaryGcsBucket()`](zingg.md#zingg.pipes.BigQueryPipe.setTemporaryGcsBucket)
    * [`BigQueryPipe.setViewsEnabled()`](zingg.md#zingg.pipes.BigQueryPipe.setViewsEnabled)
  * [`CsvPipe`](zingg.md#zingg.pipes.CsvPipe)
    * [`CsvPipe.setDelimiter()`](zingg.md#zingg.pipes.CsvPipe.setDelimiter)
    * [`CsvPipe.setHeader()`](zingg.md#zingg.pipes.CsvPipe.setHeader)
    * [`CsvPipe.setLocation()`](zingg.md#zingg.pipes.CsvPipe.setLocation)
  * [`InMemoryPipe`](zingg.md#zingg.pipes.InMemoryPipe)
    * [`InMemoryPipe.getDataset()`](zingg.md#zingg.pipes.InMemoryPipe.getDataset)
    * [`InMemoryPipe.setDataset()`](zingg.md#zingg.pipes.InMemoryPipe.setDataset)
  * [`Pipe`](zingg.md#zingg.pipes.Pipe)
    * [`Pipe.addProperty()`](zingg.md#zingg.pipes.Pipe.addProperty)
    * [`Pipe.getPipe()`](zingg.md#zingg.pipes.Pipe.getPipe)
    * [`Pipe.setSchema()`](zingg.md#zingg.pipes.Pipe.setSchema)
    * [`Pipe.toString()`](zingg.md#zingg.pipes.Pipe.toString)
  * [`SnowflakePipe`](zingg.md#zingg.pipes.SnowflakePipe)
    * [`SnowflakePipe.DATABASE`](zingg.md#zingg.pipes.SnowflakePipe.DATABASE)
    * [`SnowflakePipe.DBTABLE`](zingg.md#zingg.pipes.SnowflakePipe.DBTABLE)
    * [`SnowflakePipe.PASSWORD`](zingg.md#zingg.pipes.SnowflakePipe.PASSWORD)
    * [`SnowflakePipe.SCHEMA`](zingg.md#zingg.pipes.SnowflakePipe.SCHEMA)
    * [`SnowflakePipe.URL`](zingg.md#zingg.pipes.SnowflakePipe.URL)
    * [`SnowflakePipe.USER`](zingg.md#zingg.pipes.SnowflakePipe.USER)
    * [`SnowflakePipe.WAREHOUSE`](zingg.md#zingg.pipes.SnowflakePipe.WAREHOUSE)
    * [`SnowflakePipe.setDatabase()`](zingg.md#zingg.pipes.SnowflakePipe.setDatabase)
    * [`SnowflakePipe.setDbTable()`](zingg.md#zingg.pipes.SnowflakePipe.setDbTable)
    * [`SnowflakePipe.setPassword()`](zingg.md#zingg.pipes.SnowflakePipe.setPassword)
    * [`SnowflakePipe.setSFSchema()`](zingg.md#zingg.pipes.SnowflakePipe.setSFSchema)
    * [`SnowflakePipe.setURL()`](zingg.md#zingg.pipes.SnowflakePipe.setURL)
    * [`SnowflakePipe.setUser()`](zingg.md#zingg.pipes.SnowflakePipe.setUser)
    * [`SnowflakePipe.setWarehouse()`](zingg.md#zingg.pipes.SnowflakePipe.setWarehouse)

## API Reference

* [Module Index](py-modindex.md)
* [Index](genindex.md)
* [Search Page](search.md)

## Example API Usage

```python
from zingg.client import *
from zingg.pipes import *

#build the arguments for zingg
args = Arguments()
#set field definitions
fname = FieldDefinition("fname", "string", MatchType.FUZZY)
lname = FieldDefinition("lname", "string", MatchType.FUZZY)
stNo = FieldDefinition("stNo", "string", MatchType.FUZZY)
add1 = FieldDefinition("add1","string", MatchType.FUZZY)
add2 = FieldDefinition("add2", "string", MatchType.FUZZY)
city = FieldDefinition("city", "string", MatchType.FUZZY)
areacode = FieldDefinition("areacode", "string", MatchType.FUZZY)
state = FieldDefinition("state", "string", MatchType.FUZZY)
dob = FieldDefinition("dob", "string", MatchType.FUZZY)
ssn = FieldDefinition("ssn", "string", MatchType.FUZZY)

fieldDefs = [fname, lname, stNo, add1, add2, city, areacode, state, dob, ssn]

args.setFieldDefinition(fieldDefs)
#set the modelid and the zingg dir
args.setModelId("100")
args.setZinggDir("models")
args.setNumPartitions(4)
args.setLabelDataSampleSize(0.5)

#reading dataset into inputPipe and settint it up in 'args'
#below line should not be required if you are reading from in memory dataset
#in that case, replace df with input df
schema = "id string, fname string, lname string, stNo string, add1 string, add2 string, city string, areacode string, state string, dob string, ssn  string"
inputPipe = CsvPipe("testFebrl", "examples/febrl/test.csv", schema)
args.setData(inputPipe)
outputPipe = CsvPipe("resultFebrl", "/tmp/febrlOutput")

args.setOutput(outputPipe)

options = ClientOptions([ClientOptions.PHASE,"match"])

#Zingg execution for the given phase
zingg = Zingg(args, options)
zingg.initAndExecute()
```
