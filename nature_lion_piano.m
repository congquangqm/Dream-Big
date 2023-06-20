% Display motivational message
fprintf('Dream Big!\n\n')

% Define variables
x = 10;
y = 5;
z = 2;

% Calculate sum
sum = x + y + z;

% Plot graph
plot(x, y, 'o')
title('The sum of x,y,z is equal to')
xlabel(sum);

% Calculate difference
difference = x - y - z;

% Print the result of difference
fprintf('The difference between x,y,z is %d\n', difference)

% Calculate product
product = x .* y .* z;

% Print the result of product
fprintf('The product of x,y,z is %d\n', product)

% Calculate the ratio
ratio = (x/y)/z;

% Print the result of ratio
fprintf('The ratio of x,y,z is %d\n', ratio)

% Create a vector
vector = [x y z];

% Calculate the mean of vector
mean_vector = mean(vector);

% Print the result of the mean
fprintf('The mean of x,y,z is %d\n\n', mean_vector)

% Find the minimum value
min_value = min(vector);

% Print the result
fprintf('The minimum value of x,y,z is %d\n', min_value)

% Find the maximum value
max_value = max(vector);

% Print the result
fprintf('The maximum value of x,y,z is %d\n', max_value)

% Calculate the standard deviation
std_dev = std(vector);

% Print the result
fprintf('The standard deviation of x,y,z is %d\n', std_dev)

% Calculate the range
range = range(vector);

% Print the result
fprintf('The range of x,y,z is %d\n', range)

% Define a second vector
vector2 = [3 4 7];

% Calculate the dot product between the two vectors
dot_prod = dot(vector, vector2);

% Print the result of dot product
fprintf('The dot product of x,y,z and 3,4,7 is %d\n', dot_prod)

% Calculate the magnitude of the vectors
magnitude_1 = norm(vector);
magnitude_2 = norm(vector2);

% Print the results of the magnitude
fprintf('The magnitude of x,y,z is %d\n', magnitude_1)
fprintf('The magntiude of 3,4,7 is %d\n', magnitude_2)

% Calculate the norm
norm_vector = norm(vector);

% Print the result
fprintf('The norm of x,y,z is %d\n\n', norm_vector)

% Define a function
f = @(x,y,z) x.*y.*z;

% Apply the function to the variables
func_result = f(x,y,z);

% Print the result of the function
fprintf('Applying the function to x,y,z returns %d\n', func_result)

% Create a 3D matrix
matrix = [x y z; 3 4 7];

% Calculate the determinant of the matrix
det_matrix = det(matrix);

% Print the result 
fprintf('The determinant of the matrix is %d\n\n', det_matrix)

% Create a logical array
logical_array = [x > y, y > z, x > z];

% Print the logical array
disp(logical_array)

% Print encouraging message
fprintf('Reach higher, work hard and always keep your dreams alive.\n')