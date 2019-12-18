require 'csv'
puzzleData = CSV.parse(File.read("./day2InputSierra.txt"), converters: :numeric)

class GravityAssistProgram
  def initialize(puzzleData)
    @intArray = puzzleData[0]
    @input1 = 0
    @input2 = 0
    @newPos = 0
    @arrPos = 0
  end

  def arrayValue(displacer)
    @intArray[@arrPos + displacer]
  end

  def opCase
    case @opCode
      when 1
        add
      when 2
        multiply
      else
        puts "uh oh"
    end
  end

  def intCode
    while @intArray[@arrPos] != 99
      @opCode = arrayValue(0)
      @input1 = @intArray[arrayValue(1)]
      @input2 = @intArray[arrayValue(2)]
      @newPos = arrayValue(3)
      opCase
      @arrPos += 4
    end
    puts @intArray[0]
  end

  def add
    @intArray[@newPos] = @input1 + @input2
  end

  def multiply
    @intArray[@newPos] = @input1 * @input2
  end
end
gravityAssistProgram = GravityAssistProgram.new(puzzleData)
gravityAssistProgram.intCode
