class Developer



def frontend

p "Inside instance method, seld is: " + self.to_s

end



class << self

def backend

p "Inside class method, self is: " + self.to_s

end

end

end




developer = Developer.new

developer.frontend




Developer.backend



p "Inside metclass, self is: " + developer.metaclass_example.to_s



p developer.class.instance_methods false



p developer.class.metaclass_example.instance_methods false



p developer.class.singleton_class.instance_methods false
